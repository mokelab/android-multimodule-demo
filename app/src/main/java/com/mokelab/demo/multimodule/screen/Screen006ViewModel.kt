package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data051RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data052RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data053RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data054RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data055RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data056RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data057RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data058RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data059RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data060RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen006ViewModel @Inject constructor(
    private val repo1: Data051RepositoryImpl,
    private val repo2: Data052RepositoryImpl,
    private val repo3: Data053RepositoryImpl,
    private val repo4: Data054RepositoryImpl,
    private val repo5: Data055RepositoryImpl,
    private val repo6: Data056RepositoryImpl,
    private val repo7: Data057RepositoryImpl,
    private val repo8: Data058RepositoryImpl,
    private val repo9: Data059RepositoryImpl,
    private val repo10: Data060RepositoryImpl,

): ViewModel() {
}
