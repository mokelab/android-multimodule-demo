package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data291RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data292RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data293RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data294RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data295RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data296RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data297RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data298RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data299RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data300RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen030ViewModel @Inject constructor(
    private val repo1: Data291RepositoryImpl,
    private val repo2: Data292RepositoryImpl,
    private val repo3: Data293RepositoryImpl,
    private val repo4: Data294RepositoryImpl,
    private val repo5: Data295RepositoryImpl,
    private val repo6: Data296RepositoryImpl,
    private val repo7: Data297RepositoryImpl,
    private val repo8: Data298RepositoryImpl,
    private val repo9: Data299RepositoryImpl,
    private val repo10: Data300RepositoryImpl,

): ViewModel() {
}
