package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data351RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data352RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data353RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data354RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data355RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data356RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data357RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data358RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data359RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data360RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen036ViewModel @Inject constructor(
    private val repo1: Data351RepositoryImpl,
    private val repo2: Data352RepositoryImpl,
    private val repo3: Data353RepositoryImpl,
    private val repo4: Data354RepositoryImpl,
    private val repo5: Data355RepositoryImpl,
    private val repo6: Data356RepositoryImpl,
    private val repo7: Data357RepositoryImpl,
    private val repo8: Data358RepositoryImpl,
    private val repo9: Data359RepositoryImpl,
    private val repo10: Data360RepositoryImpl,

): ViewModel() {
}
